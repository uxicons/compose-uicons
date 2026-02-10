package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Rr.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ShekelSign = it}
