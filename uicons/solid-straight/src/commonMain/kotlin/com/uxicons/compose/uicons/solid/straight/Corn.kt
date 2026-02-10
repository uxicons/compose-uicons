package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Corn: ImageVector? = null

val Icons.Ss.Corn: ImageVector
    get() = _Corn ?: UXIcon(name = "Corn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9.72f)
                lineTo(23f, 11f)
                curveToRelative(0f, 9.61f, -6.28f, 12.61f, -10.21f, 12.96f)
                lineTo(12f, 24f)
                lineToRelative(-0.79f, -0.04f)
                curveTo(7.28f, 23.61f, 1f, 20.61f, 1f, 11f)
                lineTo(1f, 9.72f)
                reflectiveCurveTo(9.08f, 13f, 12f, 21.44f)
                curveTo(14.92f, 13f, 23f, 9.72f, 23f, 9.72f)
                close()
                moveTo(13f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.97f)
                arcTo(21.75f, 21.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16.83f)
                arcTo(21.75f, 21.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.03f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 11f)
                lineTo(6.84f, 11f)
                curveToRelative(-0.6f, -0.48f, -1.17f, -0.89f, -1.71f, -1.25f)
                curveToRelative(0.03f, -0.25f, 0.07f, -0.5f, 0.11f, -0.75f)
                lineTo(8f, 9f)
                lineTo(8f, 7f)
                lineTo(5.7f, 7f)
                arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, -2f)
                lineTo(11f, 5f)
                lineTo(11f, 3f)
                lineTo(7.52f, 3f)
                curveTo(8.77f, 1.16f, 10.35f, 0f, 12f, 0f)
                reflectiveCurveToRelative(3.23f, 1.16f, 4.48f, 3f)
                lineTo(13f, 3f)
                lineTo(13f, 5f)
                horizontalLineToRelative(4.57f)
                arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, 2f)
                lineTo(16f, 7f)
                lineTo(16f, 9f)
                horizontalLineToRelative(2.76f)
                curveToRelative(0.04f, 0.25f, 0.07f, 0.5f, 0.11f, 0.75f)
                curveToRelative(-0.54f, 0.36f, -1.11f, 0.78f, -1.71f, 1.25f)
                close()
                moveTo(14f, 9f)
                lineTo(14f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 9f)
                close()
            }
        }.also { _Corn = it}
