package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speakers: ImageVector? = null

val Icons.Rs.Speakers: ImageVector
    get() = _Speakers ?: UXIcon(name = "Speakers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 0f)
                horizontalLineToRelative(6.26f)
                curveToRelative(-0.39f, 0.58f, -0.63f, 1.27f, -0.71f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.37f, 0f, 0.7f, -0.11f, 1f, -0.28f)
                verticalLineToRelative(-3.44f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.28f, -1f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(4f, 16f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.35f, 0f, 0.69f, -0.07f, 1f, -0.18f)
                verticalLineToRelative(-5.63f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.18f, -1f, -0.18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-14f)
                lineTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(10f)
                lineTo(22f, 2.5f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _Speakers = it}
