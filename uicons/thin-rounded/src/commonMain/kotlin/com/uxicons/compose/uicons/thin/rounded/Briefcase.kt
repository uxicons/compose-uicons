package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Briefcase: ImageVector? = null

val Icons.Tr.Briefcase: ImageVector
    get() = _Briefcase ?: UXIcon(name = "Briefcase") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 4f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.31f, 0f, -4.2f, 1.76f, -4.45f, 4f)
                horizontalLineToRelative(-1.55f)
                curveTo(2.02f, 4f, 0f, 6.02f, 0f, 8.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(10.5f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
                lineTo(7.05f, 4f)
                curveToRelative(0.24f, -1.69f, 1.69f, -3f, 3.45f, -3f)
                close()
                moveTo(4.5f, 5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 12f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Briefcase = it}
