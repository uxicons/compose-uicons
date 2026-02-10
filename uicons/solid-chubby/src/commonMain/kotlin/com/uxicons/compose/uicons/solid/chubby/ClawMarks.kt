package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClawMarks: ImageVector? = null

val Icons.Sc.ClawMarks: ImageVector
    get() = _ClawMarks ?: UXIcon(name = "ClawMarks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.57f, 22.82f)
                curveToRelative(-0.38f, 0.26f, -0.88f, 0.23f, -1.22f, -0.07f)
                curveToRelative(-8.09f, -7.02f, -14.28f, -12.83f, -20.12f, -20.13f)
                curveToRelative(-0.28f, -0.35f, -0.29f, -0.84f, -0.04f, -1.2f)
                curveToRelative(0.26f, -0.36f, 0.72f, -0.52f, 1.14f, -0.37f)
                curveToRelative(0.61f, 0.21f, 15.1f, 5.33f, 20.62f, 20.61f)
                curveToRelative(0.15f, 0.43f, 0f, 0.91f, -0.37f, 1.16f)
                close()
                moveTo(21.29f, 12.35f)
                curveToRelative(0.33f, 0.28f, 0.81f, 0.31f, 1.17f, 0.08f)
                curveToRelative(0.37f, -0.23f, 0.54f, -0.67f, 0.44f, -1.09f)
                curveToRelative(-2.06f, -8.06f, -10.28f, -10.21f, -10.63f, -10.3f)
                curveToRelative(-0.42f, -0.11f, -0.87f, 0.08f, -1.1f, 0.45f)
                reflectiveCurveToRelative(-0.18f, 0.85f, 0.11f, 1.18f)
                curveToRelative(3.04f, 3.42f, 6.41f, 6.68f, 10.01f, 9.68f)
                close()
                moveTo(2.23f, 10.03f)
                curveToRelative(-0.43f, -0.1f, -0.87f, 0.09f, -1.09f, 0.46f)
                curveToRelative(-0.22f, 0.38f, -0.18f, 0.85f, 0.12f, 1.18f)
                curveToRelative(3.38f, 3.76f, 7.11f, 7.48f, 11.07f, 11.07f)
                curveToRelative(0.33f, 0.3f, 0.82f, 0.34f, 1.2f, 0.11f)
                curveToRelative(0.38f, -0.23f, 0.56f, -0.69f, 0.44f, -1.12f)
                curveToRelative(-2.63f, -9.46f, -11.36f, -11.62f, -11.73f, -11.71f)
                close()
            }
        }.also { _ClawMarks = it}
