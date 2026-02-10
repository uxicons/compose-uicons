package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Sr.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 14f)
                horizontalLineToRelative(-3.56f)
                curveToRelative(1.54f, -2.08f, 3.56f, -5.33f, 3.56f, -8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 2.67f, 2.02f, 5.92f, 3.56f, 8f)
                horizontalLineToRelative(-3.56f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.42f, -2.45f, 5.97f, -4f, 7.9f)
                curveToRelative(-1.55f, -1.92f, -4f, -5.47f, -4f, -7.9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _Ankh = it}
