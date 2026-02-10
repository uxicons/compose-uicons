package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuestionSquare: ImageVector? = null

val Icons.Bs.QuestionSquare: ImageVector
    get() = _QuestionSquare ?: UXIcon(name = "QuestionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.62f)
                curveToRelative(0f, -1.38f, 0.85f, -2.88f, 1.98f, -3.5f)
                curveToRelative(0.29f, -0.16f, 0.6f, -0.54f, 0.5f, -1.07f)
                curveToRelative(-0.07f, -0.38f, -0.41f, -0.72f, -0.79f, -0.79f)
                curveToRelative(-0.42f, -0.08f, -0.7f, 0.1f, -0.84f, 0.22f)
                curveToRelative(-0.23f, 0.19f, -0.36f, 0.47f, -0.36f, 0.77f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.1f, -1.08f, 3.28f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.23f, 3.23f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.39f, -2.01f, 4.22f)
                curveToRelative(-0.17f, 0.1f, -0.43f, 0.59f, -0.43f, 0.88f)
                verticalLineToRelative(0.62f)
                close()
                moveTo(13.5f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                close()
            }
        }.also { _QuestionSquare = it}
