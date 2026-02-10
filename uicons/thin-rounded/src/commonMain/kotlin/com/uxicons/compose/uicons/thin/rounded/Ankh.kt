package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Tr.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 15f)
                horizontalLineToRelative(-5.31f)
                curveToRelative(1.58f, -1.69f, 4.81f, -5.57f, 4.81f, -9f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 3.43f, 3.23f, 7.31f, 4.81f, 9f)
                horizontalLineToRelative(-5.31f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 3.41f, -3.82f, 7.58f, -5f, 8.79f)
                curveToRelative(-1.18f, -1.21f, -5f, -5.39f, -5f, -8.79f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
            }
        }.also { _Ankh = it}
