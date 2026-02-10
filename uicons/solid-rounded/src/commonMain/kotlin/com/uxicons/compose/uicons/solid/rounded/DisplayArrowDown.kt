package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Sr.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2.97f)
                lineToRelative(-6f, 0.03f)
                verticalLineToRelative(6.42f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-2.61f, 2.43f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.84f, -2.06f, 0.84f)
                curveToRelative(-0.76f, 0f, -1.52f, -0.29f, -2.1f, -0.87f)
                lineToRelative(-2.59f, -2.4f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.15f)
                verticalLineTo(3.0f)
                lineToRelative(-5.97f, -0.01f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.33f, 0f, -2.58f, 0.52f, -3.52f, 1.46f)
                curveToRelative(-0.95f, 0.94f, -1.47f, 2.21f, -1.47f, 3.54f)
                verticalLineToRelative(6.01f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.03f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _DisplayArrowDown = it}
