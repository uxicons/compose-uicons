package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnalyseAlt: ImageVector? = null

val Icons.Ts.AnalyseAlt: ImageVector
    get() = _AnalyseAlt ?: UXIcon(name = "AnalyseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 23.29f)
                lineToRelative(-6.58f, -6.58f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.58f, 6.58f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(1.01f, 10.01f)
                curveTo(1.01f, 5.04f, 5.04f, 1.01f, 10.01f, 1.01f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1.01f, 14.97f, 1.01f, 10.01f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-1.5f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(9.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(14f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _AnalyseAlt = it}
