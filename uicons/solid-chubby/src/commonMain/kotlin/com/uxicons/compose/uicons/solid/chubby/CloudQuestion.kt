package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudQuestion: ImageVector? = null

val Icons.Sc.CloudQuestion: ImageVector
    get() = _CloudQuestion ?: UXIcon(name = "CloudQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 10.42f)
                curveToRelative(-0.3f, -4.69f, -4.21f, -8.42f, -8.98f, -8.42f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 1.16f, 0.23f, 2.31f, 0.66f, 3.38f)
                curveToRelative(-1.03f, 0.79f, -1.66f, 2.03f, -1.66f, 3.37f)
                curveToRelative(0f, 2.34f, 1.91f, 4.25f, 4.25f, 4.25f)
                horizontalLineToRelative(11.5f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                curveToRelative(0f, -2.21f, -1.14f, -4.2f, -3.02f, -5.33f)
                close()
                moveTo(11f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.83f, 13.75f)
                curveToRelative(-0.21f, 0.08f, -0.67f, 0.13f, -0.85f, 0.24f)
                curveToRelative(0f, 0.55f, -0.43f, 1.01f, -0.99f, 1.01f)
                reflectiveCurveToRelative(-0.99f, -0.44f, -0.99f, -0.99f)
                curveToRelative(0f, -1.69f, 1.51f, -2.01f, 2.01f, -2.12f)
                curveToRelative(0.52f, -0.15f, 0.94f, -0.2f, 0.99f, -1.88f)
                curveToRelative(0f, -1.59f, -0.41f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.69f, 1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                curveToRelative(0f, 0.74f, 0f, 2.98f, -2.17f, 3.73f)
                close()
            }
        }.also { _CloudQuestion = it}
