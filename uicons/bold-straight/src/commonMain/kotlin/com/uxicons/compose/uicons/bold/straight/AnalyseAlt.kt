package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnalyseAlt: ImageVector? = null

val Icons.Bs.AnalyseAlt: ImageVector
    get() = _AnalyseAlt ?: UXIcon(name = "AnalyseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 21.87f)
                lineToRelative(-5.95f, -5.95f)
                curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
                lineToRelative(5.95f, 5.95f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(10.01f, 17.01f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(2f)
                lineTo(5f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _AnalyseAlt = it}
