package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screencast: ImageVector? = null

val Icons.Rr.Screencast: ImageVector
    get() = _Screencast ?: UXIcon(name = "Screencast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 4f)
                curveToRelative(-1.36f, 0f, -2.56f, 0.92f, -2.9f, 2.24f)
                curveToRelative(-0.14f, 0.53f, -0.68f, 0.85f, -1.22f, 0.71f)
                curveToRelative(-0.53f, -0.14f, -0.85f, -0.69f, -0.71f, -1.22f)
                curveToRelative(0.58f, -2.19f, 2.56f, -3.73f, 4.84f, -3.73f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(1.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(1.05f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(5.49f, 0f, 9.95f, 4.49f, 9.95f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -6.62f, -5.36f, -12f, -11.95f, -12f)
                close()
            }
        }.also { _Screencast = it}
