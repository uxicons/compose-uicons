package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Tc.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.61f, 1.03f)
                curveToRelative(-0.12f, -0.04f, -0.27f, -0.04f, -0.35f, 0f)
                curveToRelative(-0.18f, 0.08f, -2.35f, 0.91f, -4.06f, 4.21f)
                curveToRelative(-0.13f, 0.24f, -0.03f, 0.55f, 0.21f, 0.67f)
                curveToRelative(0.24f, 0.13f, 0.55f, 0.03f, 0.67f, -0.21f)
                curveToRelative(0.97f, -1.87f, 2.13f, -2.87f, 2.84f, -3.35f)
                verticalLineTo(22.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(2.35f)
                curveToRelative(0.72f, 0.48f, 1.88f, 1.48f, 2.84f, 3.35f)
                curveToRelative(0.13f, 0.25f, 0.43f, 0.34f, 0.67f, 0.21f)
                curveToRelative(0.25f, -0.13f, 0.34f, -0.43f, 0.21f, -0.67f)
                curveToRelative(-1.7f, -3.3f, -3.96f, -4.18f, -4.06f, -4.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.39f, 22.97f)
                curveToRelative(0.12f, 0.04f, 0.27f, 0.04f, 0.35f, 0f)
                curveToRelative(0.18f, -0.08f, 2.35f, -0.91f, 4.06f, -4.21f)
                curveToRelative(0.13f, -0.24f, 0.03f, -0.55f, -0.21f, -0.67f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                curveToRelative(-0.97f, 1.87f, -2.13f, 2.87f, -2.84f, 3.35f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(21.65f)
                curveToRelative(-0.72f, -0.48f, -1.88f, -1.48f, -2.84f, -3.35f)
                curveToRelative(-0.13f, -0.25f, -0.43f, -0.34f, -0.67f, -0.21f)
                curveToRelative(-0.25f, 0.13f, -0.34f, 0.43f, -0.21f, 0.67f)
                curveToRelative(1.7f, 3.3f, 3.96f, 4.18f, 4.06f, 4.21f)
                close()
            }
        }.also { _SortAlt = it}
