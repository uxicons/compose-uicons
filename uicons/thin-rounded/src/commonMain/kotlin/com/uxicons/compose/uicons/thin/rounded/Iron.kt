package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Tr.Iron: ImageVector
    get() = _Iron ?: UXIcon(name = "Iron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2f)
                lineTo(8.5f, 2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                verticalLineToRelative(0.5f)
                lineTo(10f, 10f)
                curveTo(5.05f, 10f, 0.9f, 13.54f, 0.12f, 18.47f)
                curveToRelative(-0.07f, 0.39f, -0.27f, 1.59f, 0.51f, 2.5f)
                curveToRelative(0.58f, 0.68f, 1.55f, 1.03f, 2.88f, 1.03f)
                lineTo(19.5f, 22f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 9.5f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-1.02f, 0f, -1.74f, -0.23f, -2.12f, -0.67f)
                curveToRelative(-0.47f, -0.56f, -0.33f, -1.38f, -0.27f, -1.75f)
                curveToRelative(0.69f, -4.39f, 4.43f, -7.58f, 8.89f, -7.58f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(11f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(9f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Iron = it}
