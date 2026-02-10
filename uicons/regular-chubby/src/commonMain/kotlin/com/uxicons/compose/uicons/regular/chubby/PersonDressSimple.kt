package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Rc.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(17f, 17.52f)
                curveToRelative(-0.02f, 0.72f, -0.01f, 0.69f, -0.0f, 1.04f)
                curveToRelative(-0.03f, 0.44f, -0.35f, 0.81f, -0.78f, 0.91f)
                curveToRelative(-0.04f, 0.01f, -0.53f, 0.12f, -1.22f, 0.23f)
                verticalLineToRelative(2.29f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.04f)
                curveToRelative(-0.34f, 0.03f, -0.67f, 0.04f, -1f, 0.04f)
                reflectiveCurveToRelative(-0.66f, -0.02f, -1f, -0.04f)
                verticalLineToRelative(2.04f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.29f)
                curveToRelative(-0.68f, -0.12f, -1.18f, -0.22f, -1.22f, -0.23f)
                curveToRelative(-0.43f, -0.1f, -0.75f, -0.47f, -0.78f, -0.91f)
                curveToRelative(0.0f, -0.35f, 0.01f, -0.33f, -0.0f, -1.04f)
                curveToRelative(-0.06f, -2.88f, 0.7f, -7.69f, 1.89f, -9.98f)
                curveToRelative(0.78f, -1.54f, 2.53f, -1.54f, 3.11f, -1.54f)
                reflectiveCurveToRelative(2.33f, 0f, 3.11f, 1.55f)
                curveToRelative(1.19f, 2.28f, 1.95f, 7.09f, 1.89f, 9.97f)
                close()
                moveTo(13.33f, 8.46f)
                curveToRelative(-0.07f, -0.14f, -0.23f, -0.46f, -1.33f, -0.46f)
                reflectiveCurveToRelative(-1.26f, 0.32f, -1.33f, 0.45f)
                curveToRelative(-1.01f, 1.94f, -1.73f, 6.45f, -1.67f, 9.03f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.14f, 0.0f, 0.2f)
                curveToRelative(0.77f, 0.14f, 1.98f, 0.32f, 3.0f, 0.32f)
                reflectiveCurveToRelative(2.23f, -0.18f, 3.0f, -0.32f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.13f, 0.0f, -0.2f)
                curveToRelative(0.06f, -2.58f, -0.66f, -7.08f, -1.67f, -9.02f)
                close()
            }
        }.also { _PersonDressSimple = it}
