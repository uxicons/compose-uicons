package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Rs.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(3.01f, 0f, 5.31f, 1.16f, 6.83f, 3.44f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(-1.7f, -2.56f, -4.22f, -2.56f, -5.17f, -2.56f)
                close()
                moveTo(9f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(19.97f, 10f)
                horizontalLineToRelative(0.03f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 14.24f)
                curveToRelative(-0.72f, 0.48f, -1.58f, 0.76f, -2.5f, 0.76f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.31f, 0f, 4.22f, 1.75f, 4.47f, 4f)
                close()
                moveTo(18f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.4f, 0f, 2.75f, -0.26f, 4f, -0.7f)
                verticalLineToRelative(-2.14f)
                curveToRelative(-1.23f, 0.54f, -2.58f, 0.84f, -4f, 0.84f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                verticalLineToRelative(6.62f)
                curveToRelative(1.26f, -1.9f, 2f, -4.17f, 2f, -6.62f)
                close()
            }
        }.also { _FaceMonocle = it}
