package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Ts.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 10.5f)
                curveToRelative(0f, 7.32f, -6.41f, 13.5f, -14f, 13.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.03f)
                curveTo(4.22f, 19.71f, 0f, 15.35f, 0f, 10f)
                curveTo(0f, 4.49f, 4.49f, 0f, 10f, 0f)
                curveToRelative(3.69f, 0f, 7.06f, 2.02f, 8.81f, 5.26f)
                curveToRelative(0.22f, 0.41f, 0.41f, 0.85f, 0.57f, 1.29f)
                curveToRelative(-0.31f, 0.17f, -0.6f, 0.36f, -0.86f, 0.6f)
                curveToRelative(-0.16f, -0.49f, -0.35f, -0.96f, -0.59f, -1.41f)
                curveToRelative(-1.57f, -2.92f, -4.61f, -4.74f, -7.93f, -4.74f)
                curveTo(5.04f, 1f, 1f, 5.04f, 1f, 10f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(3.08f, 0f, 5.91f, -1.55f, 7.58f, -4.14f)
                curveToRelative(0.26f, -0.4f, 0.47f, -0.83f, 0.67f, -1.26f)
                curveToRelative(0.24f, 0.25f, 0.5f, 0.48f, 0.8f, 0.67f)
                curveToRelative(-0.18f, 0.39f, -0.38f, 0.77f, -0.62f, 1.13f)
                curveToRelative(-1.76f, 2.74f, -4.7f, 4.41f, -7.92f, 4.57f)
                verticalLineToRelative(3.02f)
                curveToRelative(6.08f, -0.23f, 11.23f, -4.71f, 12.29f, -10.36f)
                curveToRelative(-0.38f, 0.23f, -0.82f, 0.37f, -1.29f, 0.37f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _BellSchool = it}
