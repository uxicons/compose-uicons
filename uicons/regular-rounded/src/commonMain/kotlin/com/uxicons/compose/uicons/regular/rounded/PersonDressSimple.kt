package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Rr.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16.25f, 18.98f)
                curveToRelative(-0.34f, 0.39f, -0.78f, 0.66f, -1.25f, 0.83f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.19f)
                curveToRelative(-0.47f, -0.17f, -0.91f, -0.44f, -1.25f, -0.83f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.5f, -0.73f, -2.36f)
                lineToRelative(0.88f, -7.01f)
                curveToRelative(0.26f, -2.06f, 2.02f, -3.62f, 4.1f, -3.62f)
                reflectiveCurveToRelative(3.84f, 1.56f, 4.1f, 3.62f)
                lineToRelative(0.88f, 7.01f)
                curveToRelative(0.11f, 0.85f, -0.16f, 1.71f, -0.73f, 2.36f)
                close()
                moveTo(9.01f, 16.88f)
                curveToRelative(-0.04f, 0.29f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.22f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineToRelative(4f)
                curveToRelative(0.29f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.19f, -0.22f, 0.28f, -0.5f, 0.24f, -0.79f)
                lineToRelative(-0.88f, -7.01f)
                curveToRelative(-0.13f, -1.06f, -1.04f, -1.87f, -2.12f, -1.87f)
                reflectiveCurveToRelative(-1.98f, 0.8f, -2.12f, 1.87f)
                lineToRelative(-0.88f, 7.01f)
                close()
            }
        }.also { _PersonDressSimple = it}
