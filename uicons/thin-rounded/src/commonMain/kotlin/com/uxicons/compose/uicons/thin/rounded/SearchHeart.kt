package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Tr.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-7.29f, -7.29f)
                curveToRelative(1.52f, -1.68f, 2.44f, -3.91f, 2.44f, -6.35f)
                curveTo(19f, 4.26f, 14.74f, 0f, 9.5f, 0f)
                reflectiveCurveTo(0f, 4.26f, 0f, 9.5f)
                reflectiveCurveToRelative(4.26f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.44f, 0f, 4.67f, -0.93f, 6.35f, -2.44f)
                lineToRelative(7.29f, 7.29f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(1f, 9.5f)
                curveTo(1f, 4.81f, 4.81f, 1f, 9.5f, 1f)
                reflectiveCurveToRelative(8.5f, 3.81f, 8.5f, 8.5f)
                reflectiveCurveToRelative(-3.81f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(1f, 14.19f, 1f, 9.5f)
                close()
                moveTo(11.5f, 6f)
                curveToRelative(-0.84f, 0f, -1.55f, 0.36f, -2f, 0.95f)
                curveToRelative(-0.45f, -0.58f, -1.16f, -0.95f, -2f, -0.95f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.19f, -2.5f, 2.66f)
                curveToRelative(0f, 1.9f, 2.28f, 4.22f, 3.48f, 5.18f)
                curveToRelative(0.3f, 0.24f, 0.66f, 0.36f, 1.02f, 0.36f)
                reflectiveCurveToRelative(0.72f, -0.12f, 1.01f, -0.36f)
                curveToRelative(1.21f, -0.96f, 3.48f, -3.28f, 3.48f, -5.18f)
                curveToRelative(0f, -1.47f, -1.12f, -2.66f, -2.5f, -2.66f)
                close()
                moveTo(9.89f, 13.06f)
                curveToRelative(-0.23f, 0.18f, -0.55f, 0.18f, -0.78f, 0f)
                curveToRelative(-1.29f, -1.03f, -3.11f, -3.08f, -3.11f, -4.4f)
                curveToRelative(0f, -0.92f, 0.67f, -1.66f, 1.5f, -1.66f)
                curveToRelative(0.88f, 0f, 1.5f, 0.6f, 1.5f, 1.46f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.86f, 0.62f, -1.46f, 1.5f, -1.46f)
                curveToRelative(0.83f, 0f, 1.5f, 0.74f, 1.5f, 1.66f)
                curveToRelative(0f, 1.33f, -1.82f, 3.37f, -3.11f, 4.4f)
                close()
            }
        }.also { _SearchHeart = it}
