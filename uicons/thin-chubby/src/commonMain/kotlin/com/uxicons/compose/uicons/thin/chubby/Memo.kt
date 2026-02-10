package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Memo: ImageVector? = null

val Icons.Tc.Memo: ImageVector
    get() = _Memo ?: UXIcon(name = "Memo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(16.5f, 6f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 5.25f, -0.95f, 9.52f, -0.96f, 9.56f)
                curveToRelative(-0.04f, 0.18f, -0.18f, 0.32f, -0.35f, 0.37f)
                curveToRelative(-0.16f, 0.04f, -3.89f, 1.07f, -7.69f, 1.07f)
                reflectiveCurveToRelative(-7.53f, -1.02f, -7.69f, -1.07f)
                curveToRelative(-0.18f, -0.05f, -0.31f, -0.19f, -0.35f, -0.37f)
                curveToRelative(-0.01f, -0.04f, -0.96f, -4.31f, -0.96f, -9.56f)
                reflectiveCurveToRelative(0.94f, -9.52f, 0.95f, -9.56f)
                curveToRelative(0.04f, -0.18f, 0.18f, -0.32f, 0.35f, -0.37f)
                curveToRelative(0.16f, -0.04f, 3.89f, -1.07f, 7.69f, -1.07f)
                reflectiveCurveToRelative(7.53f, 1.02f, 7.69f, 1.07f)
                curveToRelative(0.18f, 0.05f, 0.31f, 0.19f, 0.35f, 0.37f)
                curveToRelative(0.01f, 0.04f, 0.96f, 4.31f, 0.96f, 9.56f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -4.35f, -0.66f, -8.0f, -0.87f, -9.04f)
                curveToRelative(-0.95f, -0.24f, -4.06f, -0.95f, -7.13f, -0.95f)
                reflectiveCurveToRelative(-6.18f, 0.72f, -7.13f, 0.95f)
                curveToRelative(-0.21f, 1.04f, -0.87f, 4.7f, -0.87f, 9.04f)
                reflectiveCurveToRelative(0.66f, 8.0f, 0.87f, 9.04f)
                curveToRelative(0.95f, 0.24f, 4.06f, 0.95f, 7.13f, 0.95f)
                reflectiveCurveToRelative(6.18f, -0.72f, 7.13f, -0.95f)
                curveToRelative(0.21f, -1.04f, 0.87f, -4.7f, 0.87f, -9.04f)
                close()
                moveTo(11.5f, 14f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Memo = it}
