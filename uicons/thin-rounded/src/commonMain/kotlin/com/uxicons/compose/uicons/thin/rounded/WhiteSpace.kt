package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Tr.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0.5f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(11.99f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.0f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 0.07f, -0.01f, 0.13f, -0.04f, 0.19f)
                curveToRelative(-0.04f, 0.31f, -0.16f, 0.61f, -0.4f, 0.85f)
                lineToRelative(-3.2f, 3.31f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(3.05f, -3.15f)
                horizontalLineTo(2.31f)
                lineToRelative(3.05f, 3.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                curveToRelative(-0.1f, 0.09f, -0.22f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.36f, -0.15f)
                lineToRelative(-3.21f, -3.31f)
                curveToRelative(-0.25f, -0.25f, -0.38f, -0.58f, -0.41f, -0.92f)
                curveToRelative(-0.01f, -0.04f, -0.02f, -0.08f, -0.02f, -0.12f)
                curveToRelative(0f, -0.0f, 0f, -0.0f, 0f, -0.0f)
                curveToRelative(0f, -0.0f, 0f, -0.0f, 0f, -0.0f)
                verticalLineToRelative(11.51f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(0.5f)
                curveTo(0f, 0.22f, 0.22f, 0f, 0.5f, 0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(11.96f)
                curveToRelative(0.01f, -0.38f, 0.15f, -0.76f, 0.44f, -1.04f)
                lineToRelative(3.21f, -3.27f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                lineToRelative(-3.09f, 3.15f)
                horizontalLineTo(21.73f)
                lineToRelative(-3.09f, -3.15f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.52f, 0.01f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                lineToRelative(3.21f, 3.27f)
                curveToRelative(0.29f, 0.29f, 0.43f, 0.67f, 0.43f, 1.04f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _WhiteSpace = it}
