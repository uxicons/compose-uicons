package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheap: ImageVector? = null

val Icons.Rr.Cheap: ImageVector
    get() = _Cheap ?: UXIcon(name = "Cheap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 19.11f)
                curveToRelative(-0.06f, 0.51f, -0.49f, 0.89f, -0.99f, 0.89f)
                curveTo(3.93f, 19.44f, 0f, 15.14f, 0f, 10f)
                curveTo(0f, 4.49f, 4.49f, 0f, 10f, 0f)
                curveToRelative(1.56f, 0f, 3.06f, 0.35f, 4.45f, 1.04f)
                curveToRelative(0.49f, 0.25f, 0.7f, 0.85f, 0.45f, 1.34f)
                curveToRelative(-0.24f, 0.49f, -0.84f, 0.7f, -1.34f, 0.45f)
                curveToRelative(-1.11f, -0.55f, -2.31f, -0.83f, -3.56f, -0.83f)
                curveTo(5.59f, 2f, 2f, 5.59f, 2f, 10f)
                curveToRelative(0f, 4.12f, 3.06f, 7.56f, 7.11f, 8.01f)
                curveToRelative(0.55f, 0.06f, 0.94f, 0.56f, 0.88f, 1.1f)
                close()
                moveTo(10f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(23.71f, 18.17f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineTo(19f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(20.37f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.64f, 3.64f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(3.54f, -3.54f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _Cheap = it}
