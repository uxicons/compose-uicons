package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Br.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 12f)
            curveToRelative(0.1f, 0f, -0.1f, 0.01f, 0f, 0f)
            horizontalLineToRelative(0f)
            close()
            moveTo(11.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(18.32f, 6.25f)
            curveToRelative(-0.69f, -0.45f, -1.62f, -0.26f, -2.08f, 0.43f)
            lineToRelative(-1.23f, 1.88f)
            reflectiveCurveToRelative(-1.28f, -1.48f, -1.32f, -1.52f)
            curveToRelative(-0.61f, -0.58f, -1.84f, -1.04f, -2.69f, -1.04f)
            curveToRelative(-1.58f, -0.01f, -3f, 1.55f, -3f, 3.15f)
            verticalLineToRelative(4.85f)
            curveToRelative(0f, 1.41f, 0.87f, 2.91f, 2f, 3.75f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-11.69f)
            reflectiveCurveToRelative(0.41f, 0.47f, 0.43f, 0.5f)
            curveToRelative(0.44f, 0.45f, 0.95f, 0.69f, 1.57f, 0.69f)
            curveToRelative(0.73f, -0.09f, 1.74f, -0.53f, 2.06f, -1.09f)
            lineToRelative(1.69f, -2.58f)
            curveToRelative(0.45f, -0.69f, 0.26f, -1.62f, -0.43f, -2.08f)
            close()
        }
    }.also { _SunSalutationYoga = it }
