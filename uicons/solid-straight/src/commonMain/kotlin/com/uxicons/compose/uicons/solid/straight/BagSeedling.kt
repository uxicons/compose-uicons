package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagSeedling: ImageVector? = null

val Icons.Ss.BagSeedling: ImageVector
    get() = _BagSeedling ?: UXIcon(name = "BagSeedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                lineToRelative(2.01f, 3.02f)
                lineTo(-0.01f, 24.02f)
                lineToRelative(2.01f, -3.02f)
                horizontalLineToRelative(20f)
                close()
                moveTo(22f, 3f)
                lineToRelative(2.02f, -3f)
                lineTo(-0.02f, 0f)
                lineToRelative(2.02f, 3f)
                horizontalLineToRelative(20f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(14f)
                lineTo(2f, 19f)
                lineTo(2f, 5f)
                horizontalLineToRelative(20f)
                close()
                moveTo(18f, 8f)
                curveToRelative(-4.5f, 0f, -5.64f, 3.32f, -6f, 5f)
                curveToRelative(-0.36f, -1.69f, -1.5f, -5f, -5.97f, -5f)
                curveToRelative(-0.02f, 4.82f, 3.27f, 5.78f, 4.97f, 5.96f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.04f)
                curveToRelative(1.71f, -0.18f, 5f, -1.14f, 5f, -5.96f)
                close()
            }
        }.also { _BagSeedling = it}
