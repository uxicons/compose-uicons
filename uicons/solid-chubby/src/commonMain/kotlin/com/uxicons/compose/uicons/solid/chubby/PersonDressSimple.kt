package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Sc.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(15.11f, 7.55f)
                curveToRelative(-0.78f, -1.55f, -2.54f, -1.55f, -3.11f, -1.55f)
                reflectiveCurveToRelative(-2.33f, 0f, -3.11f, 1.54f)
                curveToRelative(-1.19f, 2.29f, -1.95f, 7.1f, -1.89f, 9.98f)
                curveToRelative(0.02f, 0.71f, 0.01f, 0.69f, 0.0f, 1.04f)
                curveToRelative(0.03f, 0.44f, 0.35f, 0.81f, 0.78f, 0.91f)
                curveToRelative(0.03f, 0.01f, 0.31f, 0.07f, 0.72f, 0.14f)
                verticalLineToRelative(1.88f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.51f)
                curveToRelative(0.17f, 0.01f, 0.34f, 0.01f, 0.5f, 0.01f)
                reflectiveCurveToRelative(0.33f, -0.01f, 0.5f, -0.01f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.88f)
                curveToRelative(0.41f, -0.08f, 0.69f, -0.14f, 0.72f, -0.14f)
                curveToRelative(0.43f, -0.1f, 0.75f, -0.47f, 0.78f, -0.91f)
                curveToRelative(-0.0f, -0.35f, -0.01f, -0.33f, 0.0f, -1.04f)
                curveToRelative(0.06f, -2.88f, -0.7f, -7.69f, -1.89f, -9.97f)
                close()
            }
        }.also { _PersonDressSimple = it}
