package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Rc.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.15f, 6.88f)
                curveToRelative(-1.17f, -1.16f, -3.07f, -1.17f, -4.24f, -0.01f)
                lineToRelative(-5.41f, 5.41f)
                curveToRelative(-0.87f, 0.86f, -1.38f, 2.02f, -1.44f, 3.25f)
                lineToRelative(-0.06f, 1.43f)
                curveToRelative(-0.04f, 0.57f, 0.47f, 1.08f, 1.04f, 1.04f)
                lineToRelative(1.44f, -0.06f)
                curveToRelative(1.24f, -0.05f, 2.39f, -0.56f, 3.27f, -1.42f)
                lineToRelative(5.39f, -5.4f)
                curveToRelative(1.13f, -1.0f, 1.12f, -3.23f, 0.01f, -4.25f)
                close()
                moveTo(15.75f, 9.68f)
                lineTo(10.34f, 15.1f)
                curveToRelative(-0.52f, 0.51f, -1.2f, 0.81f, -1.94f, 0.84f)
                lineToRelative(-0.35f, 0.01f)
                lineToRelative(0.01f, -0.34f)
                curveToRelative(0.03f, -0.73f, 0.33f, -1.41f, 0.85f, -1.92f)
                lineToRelative(5.41f, -5.41f)
                curveToRelative(0.39f, -0.39f, 1.06f, -0.37f, 1.44f, 0.03f)
                curveToRelative(0.31f, 0.28f, 0.32f, 1.08f, -0.01f, 1.37f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
            }
        }.also { _PenCircle = it}
