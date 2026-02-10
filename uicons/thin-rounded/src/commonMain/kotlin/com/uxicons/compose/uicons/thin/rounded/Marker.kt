package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Tr.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-1.22f, 0f, -2.51f, -0.64f, -3.38f, -1.68f)
                curveTo(4.35f, 17.25f, 2f, 12.87f, 2f, 10f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.87f, -2.35f, 7.25f, -6.62f, 12.32f)
                curveToRelative(-0.87f, 1.03f, -2.17f, 1.68f, -3.38f, 1.68f)
                close()
                moveTo(12f, 1f)
                curveTo(7.04f, 1f, 3f, 5.04f, 3f, 10f)
                curveToRelative(0f, 2.6f, 2.33f, 6.85f, 6.38f, 11.68f)
                curveToRelative(0.67f, 0.8f, 1.7f, 1.32f, 2.62f, 1.32f)
                reflectiveCurveToRelative(1.94f, -0.52f, 2.62f, -1.32f)
                curveToRelative(4.06f, -4.83f, 6.38f, -9.08f, 6.38f, -11.68f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Marker = it}
