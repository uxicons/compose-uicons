package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgress: ImageVector? = null

val Icons.Sc.ArrowProgress: ImageVector
    get() = _ArrowProgress ?: UXIcon(name = "ArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 19f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
                moveTo(21f, 17f)
                curveToRelative(-1.43f, 0f, -2f, 0.57f, -2f, 2f)
                reflectiveCurveToRelative(0.57f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.57f, 2f, -2f)
                reflectiveCurveToRelative(-0.57f, -2f, -2f, -2f)
                close()
                moveTo(21f, 7f)
                curveToRelative(1.43f, 0f, 2f, -0.57f, 2f, -2f)
                reflectiveCurveToRelative(-0.57f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.57f, -2f, 2f)
                reflectiveCurveToRelative(0.57f, 2f, 2f, 2f)
                close()
                moveTo(13.6f, 15.2f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.26f, -1.05f, -0.1f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.38f, 0.21f, 0.72f, 0.55f, 0.9f)
                curveToRelative(0.34f, 0.17f, 0.74f, 0.13f, 1.05f, -0.1f)
                curveToRelative(1.21f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.27f, -0.35f, 0.27f, -0.84f, 0f, -1.2f)
                curveToRelative(-0.91f, -1.22f, -1.99f, -2.29f, -3.2f, -3.2f)
                close()
                moveTo(19.46f, 14.12f)
                curveToRelative(0.34f, 0.76f, 1.25f, 1.08f, 1.99f, 0.74f)
                curveToRelative(0.75f, -0.34f, 1.09f, -1.23f, 0.74f, -1.99f)
                curveToRelative(-1.08f, -2.38f, -3.67f, -2.38f, -4.52f, -2.38f)
                lineToRelative(-11.67f, -0.0f)
                curveToRelative(-1.66f, 0f, -2f, -0.34f, -2f, -2f)
                reflectiveCurveToRelative(0.34f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.38f, 0.21f, 0.72f, 0.55f, 0.9f)
                curveToRelative(0.34f, 0.17f, 0.74f, 0.13f, 1.05f, -0.1f)
                curveToRelative(1.21f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.27f, -0.35f, 0.27f, -0.84f, 0f, -1.2f)
                curveToRelative(-0.91f, -1.22f, -1.99f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.26f, -1.05f, -0.1f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-3.32f, -0.0f, -5f, 1.68f, -5f, 5.0f)
                reflectiveCurveToRelative(1.68f, 5f, 5f, 5f)
                lineToRelative(11.67f, 0.0f)
                curveToRelative(1.51f, 0f, 1.7f, 0.42f, 1.79f, 0.62f)
                close()
            }
        }.also { _ArrowProgress = it}
