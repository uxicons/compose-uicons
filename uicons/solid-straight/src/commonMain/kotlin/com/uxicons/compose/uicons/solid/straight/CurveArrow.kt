package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Ss.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.77f, 20.55f)
                lineToRelative(-2.77f, 2.95f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(0.5f)
                lineTo(3.45f, 0.23f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0f)
                lineToRelative(2.95f, 2.77f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(14.54f)
                curveToRelative(0.8f, -1.34f, 1.78f, -3.31f, 2.21f, -4.8f)
                curveToRelative(1.53f, -5.42f, 2.58f, -8.74f, 4.79f, -8.74f)
                curveToRelative(1.84f, 0f, 2.88f, 2.32f, 4.06f, 6.22f)
                curveToRelative(-0.4f, -0.14f, -0.83f, -0.22f, -1.31f, -0.22f)
                curveToRelative(-2.77f, 0f, -4.15f, 2.59f, -5.26f, 4.68f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.33f, 0.62f, -1.11f, 1.94f, -1.4f, 2.32f)
                curveToRelative(-0.77f, 1.15f, -1.59f, 2f, -1.59f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.96f, 0f, 1.95f, -1.88f, 2.76f, -3.38f)
                curveToRelative(0.99f, -1.86f, 1.93f, -3.62f, 3.49f, -3.62f)
                reflectiveCurveToRelative(2.5f, 1.76f, 3.49f, 3.62f)
                curveToRelative(0.8f, 1.51f, 1.8f, 3.38f, 2.76f, 3.38f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.77f, 2.95f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.8f, 0f, 1.1f)
                close()
            }
        }.also { _CurveArrow = it}
