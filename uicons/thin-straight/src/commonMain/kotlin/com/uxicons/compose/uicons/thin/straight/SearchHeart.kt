package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Ts.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 23.25f)
                lineToRelative(-7.4f, -7.4f)
                curveToRelative(1.52f, -1.68f, 2.44f, -3.91f, 2.44f, -6.35f)
                curveTo(19f, 4.26f, 14.74f, 0f, 9.5f, 0f)
                reflectiveCurveTo(0f, 4.26f, 0f, 9.5f)
                reflectiveCurveToRelative(4.26f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.44f, 0f, 4.67f, -0.93f, 6.35f, -2.44f)
                lineToRelative(7.4f, 7.4f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(9.5f, 18f)
                curveToRelative(-4.69f, 0f, -8.5f, -3.81f, -8.5f, -8.5f)
                reflectiveCurveTo(4.81f, 1f, 9.5f, 1f)
                reflectiveCurveToRelative(8.5f, 3.81f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.81f, 8.5f, -8.5f, 8.5f)
                close()
                moveTo(11.47f, 6f)
                curveToRelative(-0.84f, 0f, -1.55f, 0.36f, -1.99f, 0.95f)
                curveToRelative(-0.45f, -0.59f, -1.17f, -0.95f, -2.01f, -0.95f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.21f, -2.5f, 2.7f)
                curveToRelative(0f, 2.49f, 3.78f, 5.24f, 4.21f, 5.54f)
                lineToRelative(0.29f, 0.2f)
                lineToRelative(0.29f, -0.2f)
                curveToRelative(0.43f, -0.3f, 4.21f, -3.05f, 4.21f, -5.54f)
                curveToRelative(0f, -1.49f, -1.12f, -2.7f, -2.5f, -2.7f)
                close()
                moveTo(9.47f, 13.21f)
                curveToRelative(-1.19f, -0.91f, -3.5f, -2.98f, -3.5f, -4.51f)
                curveToRelative(0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.9f, 0f, 1.52f, 0.62f, 1.52f, 1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.9f, 0.59f, -1.5f, 1.48f, -1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.76f, 1.5f, 1.7f)
                curveToRelative(0f, 1.54f, -2.31f, 3.61f, -3.5f, 4.51f)
                close()
            }
        }.also { _SearchHeart = it}
