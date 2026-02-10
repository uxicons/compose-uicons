package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsightHead: ImageVector? = null

val Icons.Rs.InsightHead: ImageVector
    get() = _InsightHead ?: UXIcon(name = "InsightHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.6f, 16.36f)
                lineToRelative(-1.49f, -1.49f)
                curveToRelative(0.69f, -1.45f, 1.0f, -3.06f, 0.85f, -4.71f)
                curveToRelative(-0.37f, -4.12f, -3.6f, -7.51f, -7.69f, -8.08f)
                curveToRelative(-3.31f, -0.45f, -6.48f, 0.87f, -8.47f, 3.53f)
                curveToRelative(-1.06f, 1.31f, -2.17f, 3.86f, -3.25f, 6.32f)
                lineToRelative(-0.46f, 1.06f)
                horizontalLineToRelative(1.99f)
                lineToRelative(0.68f, 5.13f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.87f, 0.99f, 0.87f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9.76f)
                lineToRelative(1.24f, 1.24f)
                verticalLineToRelative(0.76f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.5f, 0f, -2.78f, -1.12f, -2.97f, -2.61f)
                lineToRelative(-0.45f, -3.39f)
                lineTo(0f, 15.0f)
                verticalLineToRelative(-2.21f)
                lineToRelative(0.72f, -1.65f)
                curveToRelative(1.18f, -2.71f, 2.29f, -5.26f, 3.5f, -6.75f)
                curveTo(6.64f, 1.16f, 10.51f, -0.44f, 14.55f, 0.1f)
                curveToRelative(5.0f, 0.69f, 8.95f, 4.84f, 9.41f, 9.88f)
                curveToRelative(0.2f, 2.25f, -0.28f, 4.45f, -1.35f, 6.37f)
                close()
                moveTo(19f, 11f)
                curveToRelative(0f, 1.29f, -0.42f, 2.49f, -1.11f, 3.47f)
                lineToRelative(3.82f, 3.82f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.82f, -3.82f)
                curveToRelative(-0.98f, 0.7f, -2.18f, 1.11f, -3.47f, 1.11f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(13f, 15f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
            }
        }.also { _InsightHead = it}
