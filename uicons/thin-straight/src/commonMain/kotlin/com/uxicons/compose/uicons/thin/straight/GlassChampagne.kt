package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Ts.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.51f, 18.98f)
                curveToRelative(3.63f, -0.26f, 6.5f, -3.29f, 6.5f, -7.03f)
                lineToRelative(-1.04f, -11.96f)
                horizontalLineTo(6.05f)
                lineToRelative(-1.04f, 12.0f)
                curveToRelative(0f, 3.69f, 2.87f, 6.72f, 6.5f, 6.98f)
                lineToRelative(-0.0f, 4.02f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(0.0f, -4.02f)
                close()
                moveTo(17.05f, 1f)
                lineToRelative(0.35f, 4f)
                horizontalLineTo(6.62f)
                lineToRelative(0.35f, -4f)
                horizontalLineToRelative(10.08f)
                close()
                moveTo(6.0f, 12.04f)
                lineToRelative(0.53f, -6.04f)
                horizontalLineToRelative(10.95f)
                lineToRelative(0.52f, 6.0f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6.0f, -5.96f)
                close()
            }
        }.also { _GlassChampagne = it}
