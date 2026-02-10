package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoCircleCheck: ImageVector? = null

val Icons.Ts.MemoCircleCheck: ImageVector
    get() = _MemoCircleCheck ?: UXIcon(name = "MemoCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.44f, 15.55f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.22f, 0.22f, -0.51f, 0.34f, -0.82f, 0.34f)
                reflectiveCurveToRelative(-0.6f, -0.12f, -0.82f, -0.34f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(1.86f, 1.8f)
                curveToRelative(0.1f, 0.1f, 0.16f, 0.09f, 0.24f, 0.01f)
                lineToRelative(3.46f, -3.4f)
                close()
                moveTo(12.02f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9.5f)
                curveToRelative(-0.53f, 0.28f, -1.02f, 0.62f, -1.47f, 1f)
                close()
                moveTo(12.02f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(6.51f)
                curveToRelative(-0.17f, -0.01f, -0.33f, -0.01f, -0.5f, -0.01f)
                reflectiveCurveToRelative(-0.33f, 0.01f, -0.5f, 0.01f)
                lineTo(17f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(10.02f)
                curveToRelative(0.31f, 0.36f, 0.64f, 0.69f, 1.0f, 1f)
                close()
                moveTo(14f, 6f)
                lineTo(4f, 6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveTo(4f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _MemoCircleCheck = it}
