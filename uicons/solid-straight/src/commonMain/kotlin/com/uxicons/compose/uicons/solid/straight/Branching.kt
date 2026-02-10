package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branching: ImageVector? = null

val Icons.Ss.Branching: ImageVector
    get() = _Branching ?: UXIcon(name = "Branching") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineToRelative(4.16f)
                curveToRelative(0.43f, 1.44f, 1.76f, 2.5f, 3.34f, 2.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0f, -2.9f, 1.06f, -3.34f, 2.5f)
                horizontalLineToRelative(-4.16f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(4.16f)
                curveToRelative(0.43f, 1.44f, 1.76f, 2.5f, 3.34f, 2.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0f, -2.9f, 1.06f, -3.34f, 2.5f)
                horizontalLineToRelative(-6.16f)
                verticalLineTo(11f)
                horizontalLineTo(6.84f)
                curveToRelative(-0.43f, -1.44f, -1.76f, -2.5f, -3.34f, -2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0f, 2.9f, -1.06f, 3.34f, -2.5f)
                horizontalLineToRelative(4.16f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(6.16f)
                curveToRelative(0.43f, 1.44f, 1.76f, 2.5f, 3.34f, 2.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0f, -2.9f, 1.06f, -3.34f, 2.5f)
                horizontalLineToRelative(-4.16f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _Branching = it}
