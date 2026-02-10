package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SummaryCheck: ImageVector? = null

val Icons.Bs.SummaryCheck: ImageVector
    get() = _SummaryCheck ?: UXIcon(name = "SummaryCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.72f, 24f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 0f)
                horizontalLineToRelative(3f)
                lineTo(6f, 2f)
                horizontalLineToRelative(2.5f)
                lineTo(8.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(11.5f, 2f)
                horizontalLineToRelative(2.5f)
                lineTo(14f, 0f)
                horizontalLineToRelative(3f)
                lineTo(17f, 2f)
                horizontalLineToRelative(3f)
                lineTo(20f, 10.26f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.03f, -1f, 0.07f)
                lineTo(17f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.09f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.19f, 2.13f, 3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.36f, 16.74f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                lineTo(5f, 12f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(3f)
                lineTo(15f, 10f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SummaryCheck = it}
