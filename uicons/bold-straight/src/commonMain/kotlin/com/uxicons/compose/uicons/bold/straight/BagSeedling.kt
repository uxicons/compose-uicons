package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagSeedling: ImageVector? = null

val Icons.Bs.BagSeedling: ImageVector
    get() = _BagSeedling ?: UXIcon(name = "BagSeedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13.76f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.29f)
                curveToRelative(-2.1f, -0.56f, -4.73f, -2.16f, -4.47f, -6.71f)
                curveToRelative(3.32f, 0.05f, 5.06f, 1.78f, 5.97f, 3.5f)
                curveToRelative(0.92f, -1.72f, 2.67f, -3.45f, 5.99f, -3.5f)
                curveToRelative(0.26f, 4.67f, -2.38f, 6.24f, -4.5f, 6.76f)
                close()
                moveTo(22f, 19.71f)
                lineToRelative(1.72f, 4.29f)
                lineTo(0.28f, 24f)
                lineToRelative(1.72f, -4.29f)
                lineTo(2f, 4.29f)
                lineTo(0.28f, 0f)
                horizontalLineToRelative(23.43f)
                lineToRelative(-1.72f, 4.29f)
                verticalLineToRelative(15.42f)
                close()
                moveTo(19f, 20f)
                lineTo(19f, 4f)
                lineTo(5f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _BagSeedling = it}
