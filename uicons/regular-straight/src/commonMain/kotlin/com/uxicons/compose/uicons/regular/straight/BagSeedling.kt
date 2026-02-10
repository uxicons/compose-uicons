package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagSeedling: ImageVector? = null

val Icons.Rs.BagSeedling: ImageVector
    get() = _BagSeedling ?: UXIcon(name = "BagSeedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13.96f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.04f)
                curveToRelative(-1.7f, -0.18f, -4.99f, -1.14f, -4.97f, -5.96f)
                curveToRelative(4.47f, 0f, 5.61f, 3.31f, 5.97f, 5f)
                curveToRelative(0.36f, -1.68f, 1.5f, -5f, 6f, -5f)
                curveToRelative(0f, 4.82f, -3.29f, 5.78f, -5f, 5.96f)
                close()
                moveTo(22f, 19.3f)
                lineToRelative(2.01f, 4.73f)
                lineTo(-0.01f, 24.02f)
                lineToRelative(2.01f, -4.73f)
                lineTo(2f, 4.71f)
                lineTo(-0.02f, 0f)
                horizontalLineToRelative(24.03f)
                lineToRelative(-2.02f, 4.71f)
                verticalLineToRelative(14.59f)
                close()
                moveTo(3.02f, 2f)
                lineToRelative(0.86f, 2f)
                horizontalLineToRelative(16.25f)
                lineToRelative(0.86f, -2f)
                lineTo(3.02f, 2f)
                close()
                moveTo(20f, 18f)
                lineTo(20f, 6f)
                lineTo(4f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                close()
                moveTo(20.99f, 22.02f)
                lineToRelative(-0.86f, -2.02f)
                lineTo(3.87f, 20f)
                lineToRelative(-0.86f, 2.02f)
                horizontalLineToRelative(17.98f)
                close()
            }
        }.also { _BagSeedling = it}
