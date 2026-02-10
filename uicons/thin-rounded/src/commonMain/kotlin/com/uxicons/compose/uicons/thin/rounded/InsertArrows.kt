package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Tr.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.13f, 0.84f)
                curveTo(-0.06f, 0.63f, -0.04f, 0.32f, 0.16f, 0.13f)
                curveTo(0.37f, -0.06f, 0.68f, -0.04f, 0.87f, 0.16f)
                lineToRelative(5.47f, 6.0f)
                curveToRelative(1.07f, 1.2f, 1.66f, 2.73f, 1.66f, 4.33f)
                verticalLineToRelative(7.21f)
                lineToRelative(2.15f, -2.07f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                lineToRelative(-2.3f, 2.21f)
                curveToRelative(-0.29f, 0.29f, -0.66f, 0.43f, -1.04f, 0.43f)
                reflectiveCurveToRelative(-0.76f, -0.14f, -1.05f, -0.43f)
                lineToRelative(-2.29f, -2.21f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(2.15f, 2.07f)
                verticalLineToRelative(-7.21f)
                curveToRelative(0f, -1.35f, -0.5f, -2.65f, -1.4f, -3.66f)
                lineTo(0.13f, 0.84f)
                close()
                moveTo(23.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(15.45f, 18.57f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                reflectiveCurveToRelative(0.76f, -0.14f, 1.04f, -0.43f)
                lineToRelative(2.3f, -2.21f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-2.15f, 2.07f)
                verticalLineToRelative(-7.21f)
                curveToRelative(0f, -1.35f, 0.5f, -2.65f, 1.4f, -3.66f)
                lineTo(23.87f, 0.84f)
                curveToRelative(0.19f, -0.2f, 0.17f, -0.52f, -0.03f, -0.71f)
                curveToRelative(-0.2f, -0.18f, -0.52f, -0.17f, -0.71f, 0.03f)
                lineToRelative(-5.48f, 6.01f)
                curveToRelative(-1.07f, 1.19f, -1.65f, 2.73f, -1.65f, 4.33f)
                verticalLineToRelative(7.21f)
                lineToRelative(-2.15f, -2.07f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.52f, 0.01f, 0.71f)
                lineToRelative(2.29f, 2.21f)
                close()
            }
        }.also { _InsertArrows = it}
