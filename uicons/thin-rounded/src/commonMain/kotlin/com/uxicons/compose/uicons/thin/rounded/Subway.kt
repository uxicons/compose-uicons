package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Tr.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                lineTo(2f, 14.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(0.12f)
                lineToRelative(-2.55f, 4.24f)
                curveToRelative(-0.14f, 0.24f, -0.07f, 0.54f, 0.17f, 0.69f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                curveToRelative(0.17f, 0f, 0.34f, -0.09f, 0.43f, -0.24f)
                lineToRelative(2.85f, -4.76f)
                horizontalLineToRelative(8.43f)
                lineToRelative(2.85f, 4.76f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.24f, 0.43f, 0.24f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.26f, -0.07f)
                curveToRelative(0.24f, -0.14f, 0.31f, -0.45f, 0.17f, -0.69f)
                lineToRelative(-2.55f, -4.24f)
                horizontalLineToRelative(0.12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(12.5f, 12f)
                lineTo(12.5f, 5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7f)
                lineTo(12.5f, 12f)
                close()
                moveTo(3f, 12f)
                lineTo(3f, 5f)
                lineTo(11.5f, 5f)
                verticalLineToRelative(7f)
                lineTo(3f, 12f)
                close()
                moveTo(6.5f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(3.04f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(17.5f, 18f)
                lineTo(6.5f, 18f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Subway = it}
