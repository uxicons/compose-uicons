package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoking: ImageVector? = null

val Icons.Rs.Smoking: ImageVector
    get() = _Smoking ?: UXIcon(name = "Smoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-6f)
                lineTo(0f, 16f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 20f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(2f, 20f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 11.82f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.7f, -0.37f, -1.36f, -0.97f, -1.72f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.5f, -0.9f, -2.43f, -2.54f, -2.43f, -4.29f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.2f, 0.72f, 1.94f, 2.03f, 1.94f, 3.43f)
                close()
                moveTo(24f, 10.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.05f, -0.56f, -2.03f, -1.46f, -2.57f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.53f, -1.46f, -2.57f)
                lineTo(17.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.5f, 0.9f, 2.43f, 2.54f, 2.43f, 4.29f)
                close()
            }
        }.also { _Smoking = it}
