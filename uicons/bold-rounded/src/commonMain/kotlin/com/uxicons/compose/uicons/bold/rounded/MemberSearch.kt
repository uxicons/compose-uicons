package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemberSearch: ImageVector? = null

val Icons.Br.MemberSearch: ImageVector
    get() = _MemberSearch ?: UXIcon(name = "MemberSearch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.05f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(12.36f, 0f, 9.05f, 0f)
            reflectiveCurveTo(3.05f, 2.69f, 3.05f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9.05f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(23.57f, 21.45f)
            lineToRelative(-2.11f, -2.15f)
            curveToRelative(0.36f, -0.69f, 0.59f, -1.47f, 0.59f, -2.3f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            curveToRelative(0.83f, 0f, 1.6f, -0.22f, 2.29f, -0.58f)
            lineToRelative(2.09f, 2.13f)
            curveToRelative(0.29f, 0.3f, 0.68f, 0.45f, 1.07f, 0.45f)
            curveToRelative(0.38f, 0f, 0.76f, -0.14f, 1.05f, -0.43f)
            curveToRelative(0.59f, -0.58f, 0.6f, -1.53f, 0.02f, -2.12f)
            close()
            moveTo(17.05f, 19f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
            moveTo(10.0f, 15.41f)
            curveToRelative(0.06f, 0.83f, -0.56f, 1.54f, -1.39f, 1.6f)
            curveToRelative(-2.98f, 0.21f, -5.37f, 2.61f, -5.56f, 5.58f)
            curveToRelative(-0.05f, 0.79f, -0.71f, 1.4f, -1.5f, 1.4f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.0f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.77f, -1.4f, -1.6f)
            curveToRelative(0.3f, -4.46f, 3.88f, -8.06f, 8.34f, -8.38f)
            curveToRelative(0.83f, -0.05f, 1.54f, 0.56f, 1.6f, 1.39f)
            close()
        }
    }.also { _MemberSearch = it }
