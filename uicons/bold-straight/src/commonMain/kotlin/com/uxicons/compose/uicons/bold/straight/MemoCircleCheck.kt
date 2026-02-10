package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoCircleCheck: ImageVector? = null

val Icons.Bs.MemoCircleCheck: ImageVector
    get() = _MemoCircleCheck ?: UXIcon(name = "MemoCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.03f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.53f)
                curveToRelative(-0.17f, -0.01f, -0.33f, -0.03f, -0.5f, -0.03f)
                curveToRelative(-0.87f, 0f, -1.71f, 0.13f, -2.5f, 0.38f)
                lineTo(15f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.53f, 1.16f, 1.3f, 2.19f, 2.27f, 3f)
                close()
                moveTo(13f, 10.3f)
                verticalLineToRelative(-0.3f)
                lineTo(5f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.3f)
                curveToRelative(0.69f, -1.09f, 1.61f, -2.02f, 2.7f, -2.7f)
                close()
                moveTo(13f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22.55f, 16.57f)
                lineToRelative(-2.1f, -2.15f)
                lineToRelative(-3.45f, 3.38f)
                lineToRelative(-1.96f, -1.88f)
                lineToRelative(-2.08f, 2.16f)
                lineToRelative(2.27f, 2.19f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                curveToRelative(0.64f, 0f, 1.27f, -0.24f, 1.75f, -0.72f)
                lineToRelative(3.79f, -3.71f)
                close()
            }
        }.also { _MemoCircleCheck = it}
