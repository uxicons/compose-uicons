package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsightHead: ImageVector? = null

val Icons.Ts.InsightHead: ImageVector
    get() = _InsightHead ?: UXIcon(name = "InsightHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.2f, 0f, 2.28f, -0.44f, 3.15f, -1.15f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-4.5f, -4.5f)
                curveToRelative(0.7f, -0.86f, 1.15f, -1.95f, 1.15f, -3.15f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(13f, 15f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(22.41f, 16.87f)
                lineToRelative(-0.73f, -0.73f)
                curveToRelative(1.14f, -1.98f, 1.58f, -4.38f, 1.2f, -6.8f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.64f, -4.06f, -3.63f, -7.24f, -7.62f, -8.1f)
                curveToRelative(-3.91f, -0.84f, -7.81f, 0.6f, -10.18f, 3.76f)
                curveToRelative(-0.99f, 1.23f, -2.02f, 3.71f, -3.02f, 6.1f)
                curveToRelative(-0.35f, 0.85f, -0.71f, 1.7f, -1.06f, 2.5f)
                verticalLineToRelative(0.4f)
                horizontalLineToRelative(2.22f)
                lineToRelative(0.95f, 4.79f)
                curveToRelative(0.14f, 0.7f, 0.76f, 1.21f, 1.47f, 1.21f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1.47f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.36f)
                curveToRelative(-1.19f, 0f, -2.22f, -0.85f, -2.45f, -2.01f)
                lineToRelative(-0.79f, -3.99f)
                lineTo(0f, 15.0f)
                lineToRelative(0.04f, -1.7f)
                curveToRelative(0.36f, -0.82f, 0.73f, -1.7f, 1.1f, -2.58f)
                curveToRelative(1.07f, -2.57f, 2.08f, -5.01f, 3.15f, -6.33f)
                curveTo(6.89f, 0.92f, 11.17f, -0.66f, 15.47f, 0.26f)
                curveToRelative(4.39f, 0.95f, 7.69f, 4.45f, 8.39f, 8.92f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.43f, 2.75f, -0.1f, 5.47f, -1.45f, 7.69f)
                close()
            }
        }.also { _InsightHead = it}
