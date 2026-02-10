package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryClasp: ImageVector? = null

val Icons.Tr.DiaryClasp: ImageVector
    get() = _DiaryClasp ?: UXIcon(name = "DiaryClasp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5f)
                lineTo(7f, 17f)
                lineTo(7f, 1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3f, 4.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.22f, 3f, -3.46f)
                verticalLineToRelative(15.96f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.4f, -2.5f, 1.05f)
                lineTo(3f, 4.5f)
                close()
                moveTo(17.5f, 23f)
                lineTo(5.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _DiaryClasp = it}
