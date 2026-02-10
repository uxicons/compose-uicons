package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Rr.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-3.19f, -3.19f)
                curveToRelative(0.92f, -0.75f, 1.48f, -1.88f, 1.48f, -3.11f)
                lineTo(22f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(6f, 2f)
                curveToRelative(-0.72f, 0f, -1.42f, 0.19f, -2.03f, 0.55f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.69f, -0.35f, 1.31f, -0.91f, 1.68f)
                lineTo(5.48f, 4.07f)
                curveToRelative(0.17f, -0.04f, 0.34f, -0.07f, 0.52f, -0.07f)
                close()
                moveTo(15.48f, 19.36f)
                curveToRelative(0.35f, 0.42f, 0.29f, 1.06f, -0.13f, 1.41f)
                lineToRelative(-2.17f, 1.79f)
                curveToRelative(-0.33f, 0.29f, -0.75f, 0.44f, -1.17f, 0.44f)
                curveToRelative(-0.43f, 0f, -0.87f, -0.15f, -1.22f, -0.46f)
                lineToRelative(-3.02f, -2.54f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.14f)
                curveToRelative(0.23f, 0f, 0.46f, 0.08f, 0.65f, 0.23f)
                lineToRelative(3.22f, 2.71f)
                lineToRelative(2.08f, -1.72f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.29f, 1.41f, 0.13f)
                close()
            }
        }.also { _MessageSlash = it}
