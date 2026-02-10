package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Ts.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.05f, 11.73f)
                lineToRelative(0.14f, 0.27f)
                horizontalLineToRelative(1.81f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(18.31f, 0f, 15f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(1.85f)
                lineToRelative(0.14f, -0.28f)
                curveToRelative(0.76f, -1.52f, 1.97f, -3.22f, 2.51f, -3.22f)
                reflectiveCurveToRelative(1.78f, 1.7f, 2.56f, 3.23f)
                close()
                moveTo(7.24f, 11f)
                horizontalLineToRelative(-1.24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(3.24f, 1f, 6f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.58f, -1.09f, -2.01f, -3.5f, -3.3f, -3.5f)
                reflectiveCurveToRelative(-2.69f, 2.4f, -3.26f, 3.5f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                lineTo(23f, 0f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _MaskSnorkel = it}
