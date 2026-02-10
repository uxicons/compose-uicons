package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePensive: ImageVector? = null

val Icons.Sc.FacePensive: ImageVector
    get() = _FacePensive ?: UXIcon(name = "FacePensive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0.88f, 0f, 1f, -0.12f, 1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.99f, -1.01f, 3f, -3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(5.32f, 12.73f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.42f, 1.41f, -0.05f)
                curveToRelative(1.05f, 0.98f, 1.58f, 0.98f, 2.63f, 0f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.36f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                curveToRelative(-0.92f, 0.85f, -1.79f, 1.27f, -2.68f, 1.27f)
                reflectiveCurveToRelative(-1.77f, -0.41f, -2.68f, -1.27f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18.68f, 12.73f)
                curveToRelative(-0.92f, 0.85f, -1.79f, 1.27f, -2.68f, 1.27f)
                reflectiveCurveToRelative(-1.77f, -0.41f, -2.68f, -1.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.42f, 1.41f, -0.05f)
                curveToRelative(1.05f, 0.98f, 1.58f, 0.98f, 2.63f, 0f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.36f, 1.41f, 0.05f)
                reflectiveCurveToRelative(0.35f, 1.04f, -0.05f, 1.41f)
                close()
                moveTo(18f, 9f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.88f, 0.12f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FacePensive = it}
