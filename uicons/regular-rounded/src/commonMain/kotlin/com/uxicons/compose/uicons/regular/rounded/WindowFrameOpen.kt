package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrameOpen: ImageVector? = null

val Icons.Rr.WindowFrameOpen: ImageVector
    get() = _WindowFrameOpen ?: UXIcon(name = "WindowFrameOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(2f, 12f)
                verticalLineToRelative(-7f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(17f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(7f)
                verticalLineTo(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _WindowFrameOpen = it}
