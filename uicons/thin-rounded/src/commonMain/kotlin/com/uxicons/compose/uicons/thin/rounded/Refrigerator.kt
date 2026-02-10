package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refrigerator: ImageVector? = null

val Icons.Tr.Refrigerator: ImageVector
    get() = _Refrigerator ?: UXIcon(name = "Refrigerator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(6.5f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 9f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(17.5f, 23f)
                lineTo(6.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Refrigerator = it}
