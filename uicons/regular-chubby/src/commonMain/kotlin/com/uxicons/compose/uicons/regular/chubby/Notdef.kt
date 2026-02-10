package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Rc.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.88f, 2.44f)
                curveToRelative(-0.1f, -0.32f, -0.36f, -0.56f, -0.68f, -0.65f)
                curveToRelative(-0.11f, -0.03f, -2.85f, -0.79f, -7.2f, -0.79f)
                reflectiveCurveToRelative(-7.09f, 0.76f, -7.2f, 0.79f)
                curveToRelative(-0.32f, 0.09f, -0.58f, 0.33f, -0.68f, 0.65f)
                curveToRelative(-0.05f, 0.14f, -1.12f, 3.47f, -1.12f, 9.56f)
                reflectiveCurveToRelative(1.07f, 9.42f, 1.12f, 9.56f)
                curveToRelative(0.1f, 0.32f, 0.36f, 0.56f, 0.68f, 0.65f)
                curveToRelative(0.11f, 0.03f, 2.85f, 0.79f, 7.2f, 0.79f)
                reflectiveCurveToRelative(7.09f, -0.76f, 7.2f, -0.79f)
                curveToRelative(0.32f, -0.09f, 0.58f, -0.33f, 0.68f, -0.65f)
                curveToRelative(0.05f, -0.14f, 1.12f, -3.47f, 1.12f, -9.56f)
                reflectiveCurveToRelative(-1.07f, -9.42f, -1.12f, -9.56f)
                close()
                moveTo(13.23f, 12f)
                lineTo(18.4f, 4.85f)
                curveToRelative(0.28f, 1.5f, 0.6f, 3.91f, 0.6f, 7.15f)
                reflectiveCurveToRelative(-0.32f, 5.65f, -0.6f, 7.15f)
                lineToRelative(-5.17f, -7.15f)
                close()
                moveTo(16.99f, 3.38f)
                lineTo(12.0f, 10.29f)
                lineTo(7.01f, 3.38f)
                curveToRelative(1.16f, -0.18f, 2.86f, -0.38f, 4.99f, -0.38f)
                reflectiveCurveToRelative(3.83f, 0.19f, 4.99f, 0.38f)
                close()
                moveTo(5.6f, 19.15f)
                curveToRelative(-0.28f, -1.5f, -0.6f, -3.91f, -0.6f, -7.15f)
                reflectiveCurveToRelative(0.32f, -5.65f, 0.6f, -7.15f)
                lineToRelative(5.17f, 7.15f)
                lineToRelative(-5.16f, 7.15f)
                close()
                moveTo(7.01f, 20.62f)
                lineTo(12f, 13.71f)
                lineTo(16.99f, 20.62f)
                curveToRelative(-1.16f, 0.18f, -2.86f, 0.38f, -4.99f, 0.38f)
                reflectiveCurveToRelative(-3.83f, -0.19f, -4.99f, -0.38f)
                close()
            }
        }.also { _Notdef = it}
