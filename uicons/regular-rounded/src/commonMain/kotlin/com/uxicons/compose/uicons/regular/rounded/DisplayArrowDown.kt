package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Rr.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.02f)
                curveToRelative(0f, -1.34f, 0.52f, -2.6f, 1.47f, -3.54f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.53f, -1.46f)
                horizontalLineToRelative(0.03f)
                lineToRelative(2.98f, 0.02f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 0.99f, 1.0f)
                curveToRelative(-0.0f, 0.55f, -0.45f, 0.99f, -1f, 0.99f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-2.98f, -0.02f)
                curveToRelative(-0.8f, -0.03f, -1.56f, 0.31f, -2.13f, 0.87f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.13f)
                verticalLineToRelative(6.02f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(8.68f, 7.27f)
                curveToRelative(-0.4f, -0.38f, -1.04f, -0.35f, -1.41f, 0.05f)
                curveToRelative(-0.38f, 0.41f, -0.35f, 1.04f, 0.05f, 1.41f)
                lineToRelative(2.59f, 2.4f)
                curveToRelative(0.58f, 0.58f, 1.34f, 0.87f, 2.1f, 0.87f)
                curveToRelative(0.75f, 0f, 1.5f, -0.28f, 2.06f, -0.84f)
                lineToRelative(2.61f, -2.43f)
                curveToRelative(0.4f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-0.38f, -0.41f, -1.01f, -0.43f, -1.41f, -0.05f)
                lineToRelative(-2.32f, 2.15f)
                lineTo(13.0f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8.42f)
                lineToRelative(-2.32f, -2.15f)
                close()
            }
        }.also { _DisplayArrowDown = it}
