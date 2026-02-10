package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPeople: ImageVector? = null

val Icons.Tc.NoPeople: ImageVector
    get() = _NoPeople ?: UXIcon(name = "NoPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 3.44f)
                curveToRelative(-0.04f, -0.17f, -0.16f, -0.3f, -0.33f, -0.35f)
                curveToRelative(-0.13f, -0.04f, -3.3f, -1.08f, -9.61f, -1.08f)
                reflectiveCurveToRelative(-9.48f, 1.04f, -9.61f, 1.08f)
                curveToRelative(-0.16f, 0.05f, -0.28f, 0.19f, -0.33f, 0.35f)
                curveToRelative(-0.04f, 0.17f, -1.06f, 4.33f, -1.06f, 8.56f)
                reflectiveCurveToRelative(1.02f, 8.39f, 1.06f, 8.56f)
                curveToRelative(0.04f, 0.17f, 0.16f, 0.3f, 0.33f, 0.35f)
                curveToRelative(0.13f, 0.04f, 3.3f, 1.08f, 9.61f, 1.08f)
                reflectiveCurveToRelative(9.48f, -1.04f, 9.61f, -1.08f)
                curveToRelative(0.16f, -0.05f, 0.28f, -0.19f, 0.33f, -0.35f)
                curveToRelative(0.04f, -0.17f, 1.06f, -4.33f, 1.06f, -8.56f)
                reflectiveCurveToRelative(-1.02f, -8.39f, -1.06f, -8.56f)
                close()
                moveTo(21.03f, 20.05f)
                curveToRelative(-0.87f, 0.24f, -3.9f, 0.95f, -9.03f, 0.95f)
                reflectiveCurveToRelative(-8.16f, -0.71f, -9.03f, -0.95f)
                curveToRelative(-0.23f, -1f, -0.97f, -4.55f, -0.97f, -8.05f)
                reflectiveCurveToRelative(0.74f, -7.05f, 0.97f, -8.05f)
                curveToRelative(0.87f, -0.24f, 3.9f, -0.95f, 9.03f, -0.95f)
                reflectiveCurveToRelative(8.16f, 0.71f, 9.03f, 0.95f)
                curveToRelative(0.23f, 1f, 0.97f, 4.55f, 0.97f, 8.05f)
                reflectiveCurveToRelative(-0.74f, 7.05f, -0.97f, 8.05f)
                close()
            }
        }.also { _NoPeople = it}
