package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupiahSign: ImageVector? = null

val Icons.Tr.RupiahSign: ImageVector
    get() = _RupiahSign ?: UXIcon(name = "RupiahSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(10.09f, 14.54f)
                curveToRelative(2.86f, -1.06f, 4.91f, -3.81f, 4.91f, -7.04f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                horizontalLineToRelative(-3f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                lineTo(0f, 23.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(1f, 15f)
                lineTo(7.5f, 15f)
                curveToRelative(0.55f, 0f, 1.09f, -0.06f, 1.61f, -0.17f)
                lineToRelative(4.95f, 8.92f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.26f, 0.44f, 0.26f)
                curveToRelative(0.08f, 0f, 0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.24f, -0.13f, 0.33f, -0.44f, 0.19f, -0.68f)
                lineToRelative(-4.84f, -8.72f)
                close()
                moveTo(1f, 14f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                lineTo(1f, 14f)
                close()
            }
        }.also { _RupiahSign = it}
