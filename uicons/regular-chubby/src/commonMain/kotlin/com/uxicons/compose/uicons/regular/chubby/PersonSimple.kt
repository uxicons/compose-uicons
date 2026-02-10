package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSimple: ImageVector? = null

val Icons.Rc.PersonSimple: ImageVector
    get() = _PersonSimple ?: UXIcon(name = "PersonSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(17f, 11.5f)
                curveToRelative(0f, 2.34f, -0.45f, 4.32f, -0.47f, 4.4f)
                curveToRelative(-0.09f, 0.4f, -0.41f, 0.7f, -0.81f, 0.76f)
                curveToRelative(-0.03f, 0.01f, -0.31f, 0.05f, -0.72f, 0.1f)
                verticalLineToRelative(5.23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.04f)
                curveToRelative(-0.34f, 0.02f, -0.67f, 0.04f, -1f, 0.04f)
                reflectiveCurveToRelative(-0.67f, -0.01f, -1f, -0.04f)
                verticalLineToRelative(5.04f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.23f)
                curveToRelative(-0.41f, -0.06f, -0.69f, -0.1f, -0.72f, -0.1f)
                curveToRelative(-0.4f, -0.07f, -0.72f, -0.37f, -0.81f, -0.76f)
                curveToRelative(-0.02f, -0.08f, -0.47f, -2.07f, -0.47f, -4.4f)
                reflectiveCurveToRelative(0.45f, -4.32f, 0.47f, -4.4f)
                curveToRelative(0.09f, -0.4f, 0.41f, -0.7f, 0.81f, -0.76f)
                curveToRelative(0.08f, -0.01f, 2.06f, -0.33f, 3.72f, -0.33f)
                reflectiveCurveToRelative(3.63f, 0.32f, 3.72f, 0.33f)
                curveToRelative(0.4f, 0.07f, 0.72f, 0.37f, 0.81f, 0.76f)
                curveToRelative(0.02f, 0.08f, 0.47f, 2.07f, 0.47f, 4.4f)
                close()
                moveTo(15f, 11.5f)
                curveToRelative(0f, -1.34f, -0.17f, -2.57f, -0.29f, -3.29f)
                curveToRelative(-0.69f, -0.09f, -1.77f, -0.21f, -2.71f, -0.21f)
                reflectiveCurveToRelative(-2.02f, 0.12f, -2.71f, 0.21f)
                curveToRelative(-0.12f, 0.72f, -0.29f, 1.95f, -0.29f, 3.29f)
                reflectiveCurveToRelative(0.17f, 2.57f, 0.29f, 3.29f)
                curveToRelative(0.69f, 0.09f, 1.77f, 0.21f, 2.71f, 0.21f)
                reflectiveCurveToRelative(2.02f, -0.12f, 2.71f, -0.21f)
                curveToRelative(0.12f, -0.72f, 0.29f, -1.95f, 0.29f, -3.29f)
                close()
            }
        }.also { _PersonSimple = it}
